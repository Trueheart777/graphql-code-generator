import * as React from 'react';
import { UserQuery } from '../../generated-models';

export class TestWithComponent extends React.Component {
  render() {
    return (
      <UserQuery.Component variables={{ id: Date.now().toString() }}>
        {({ loading, error, data }) => {
          if (loading) return 'Loading...';
          if (error) return `Error! ${error.message}`;
          return (
            <dl>
              <dt>
                <strong>First Name:</strong>
              </dt>
              <dd>{data.User.firstName}</dd>
              <dt>
                <strong>Last Name:</strong>
              </dt>
              <dd>{data.User.lastName}</dd>
              <dt>
                <strong>Email:</strong>
              </dt>
              <dd>{data.User.email}</dd>
              <dt>
                <strong>Avatar:</strong>
              </dt>
              <dd>
                <img src={data.User.avatar} />
              </dd>
            </dl>
          );
        }}
      </UserQuery.Component>
    );
  }
}
